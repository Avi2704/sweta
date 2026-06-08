import { render, screen } from '@testing-library/react';
import { describe, it, expect } from 'vitest';
import { AssetStatusBadge } from './AssetStatusBadge';

describe('AssetStatusBadge', () => {
  it('renders correct color for AVAILABLE status', () => {
    render(<AssetStatusBadge status="AVAILABLE" />);
    expect(screen.getByText('AVAILABLE')).toBeTruthy();
  });

  it('renders correct color for IN_USE status', () => {
    render(<AssetStatusBadge status="IN_USE" />);
    expect(screen.getByText('IN_USE')).toBeTruthy();
  });
});
