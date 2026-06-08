import React from 'react';
import ReactDOM from 'react-dom/client';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import { AppShell } from './components/layout/AppShell';
import { routes } from './routes';

const App = () => (
  <BrowserRouter>
    <AppShell>
      <Routes>
        {routes.map((r) => <Route key={r.path} path={r.path} element={r.element} />)}
      </Routes>
    </AppShell>
  </BrowserRouter>
);

ReactDOM.createRoot(document.getElementById('root')!).render(<App />);
