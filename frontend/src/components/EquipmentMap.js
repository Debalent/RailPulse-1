// EquipmentMap component placeholder
// Visualizes equipment locations and status on a map
import React from 'react';

export default function EquipmentMap({ locations }) {
  return (
    <div style={{ height: '300px', background: '#e0e0e0', marginBottom: '10px' }}>
      <h3>Equipment Map</h3>
      {/* Integrate Leaflet or Google Maps here for real implementation */}
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
