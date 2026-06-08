import React from 'react';

type Status = 'AVAILABLE' | 'IN_USE' | 'REQUESTED';

const colors: Record<Status, string> = {
  AVAILABLE: 'green',
  IN_USE: 'blue',
  REQUESTED: 'orange'
};

export const AssetStatusBadge = ({ status }: { status: Status }) => (
  <span style={{ color: colors[status] }}>{status}</span>
);
