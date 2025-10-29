// AlertBanner component placeholder
// Displays alerts for risk thresholds or maintenance due
import React from 'react';

export default function AlertBanner({ alerts }) {
  if (!alerts || alerts.length === 0) return null;
  return (
    <div style={{ background: '#ffe0e0', padding: '10px', marginBottom: '10px' }}>
      <strong>Alerts:</strong>
      <ul>
        {alerts.map((a, i) => (
          <li key={i}>{a.message}</li>
        ))}
      </ul>
    </div>
  );
}
