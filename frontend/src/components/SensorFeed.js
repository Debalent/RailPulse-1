// SensorFeed component placeholder
// Simulates or displays live sensor data
import { useEffect, useState } from 'react';

export default function SensorFeed() {
  const [data, setData] = useState([]);

  useEffect(() => {
    // Simulate live data fetch
    const interval = setInterval(() => {
      setData(prev => [...prev, { timestamp: Date.now(), value: Math.random() * 100 }]);
    }, 2000);
    return () => clearInterval(interval);
  }, []);

  return (
    <div>
      <h3>Live Sensor Data</h3>
      <ul>
        {data.slice(-10).map((d, i) => (
          <li key={i}>{new Date(d.timestamp).toLocaleTimeString()}: {d.value.toFixed(2)}</li>
        ))}
      </ul>
    </div>
  );
}
