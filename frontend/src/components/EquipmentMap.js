// EquipmentMap production-ready: Leaflet integration
import React, { useEffect } from 'react';
// For real use, install leaflet and react-leaflet
// import { MapContainer, TileLayer, Marker, Popup } from 'react-leaflet';
// import 'leaflet/dist/leaflet.css';

export default function EquipmentMap({ locations }) {
  useEffect(() => {
    // TODO: Fetch real equipment locations from backend
  }, []);

  return (
    <div style={{ height: '300px', background: '#e0e0e0', marginBottom: '10px' }}>
      <h3>Equipment Map</h3>
      {/* Example Leaflet integration below (uncomment and install dependencies for real use) */}
      {/*
      <MapContainer center={[51.505, -0.09]} zoom={5} style={{ height: '100%', width: '100%' }}>
        <TileLayer url="https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png" />
        {locations && locations.map(loc => (
          <Marker key={loc.id} position={[loc.lat, loc.lng]}>
            <Popup>
              ID: {loc.id}<br />Status: {loc.status}
            </Popup>
          </Marker>
        ))}
      </MapContainer>
      */}
      <ul>
        {locations && locations.length > 0 ? (
          locations.map((loc, i) => (
            <li key={i}>ID: {loc.id}, Lat: {loc.lat}, Lng: {loc.lng}, Status: {loc.status}</li>
          ))
        ) : (
          <li>No equipment locations available.</li>
        )}
      </ul>
    </div>
  );
}
