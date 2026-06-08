import React from "react";

const P0 = () => <div>/login</div>;
const P1 = () => <div>/dashboard</div>;
const P2 = () => <div>/assets</div>;
const P3 = () => <div>/assets/new</div>;
const P4 = () => <div>/assets/:id</div>;
const P5 = () => <div>/assets/:id/edit</div>;
const P6 = () => <div>/requests</div>;
const P7 = () => <div>/requests/new</div>;
const P8 = () => <div>/requests/:id</div>;
const P9 = () => <div>/assignments</div>;
const P10 = () => <div>/my-asset</div>;
const P11 = () => <div>/tickets</div>;
const P12 = () => <div>/tickets/new</div>;
const P13 = () => <div>/tickets/:id</div>;
const P14 = () => <div>/users</div>;
const P15 = () => <div>/users/:id</div>;
const P16 = () => <div>/reports</div>;
const P17 = () => <div>/audit-logs</div>;
const P18 = () => <div>/settings</div>;
const P19 = () => <div>/qr/:assetTag</div>;
const P20 = () => <div>/profile</div>;
const P21 = () => <div>*</div>;

export const routes = [
  { path: "/login", element: <P0 /> },
  { path: "/dashboard", element: <P1 /> },
  { path: "/assets", element: <P2 /> },
  { path: "/assets/new", element: <P3 /> },
  { path: "/assets/:id", element: <P4 /> },
  { path: "/assets/:id/edit", element: <P5 /> },
  { path: "/requests", element: <P6 /> },
  { path: "/requests/new", element: <P7 /> },
  { path: "/requests/:id", element: <P8 /> },
  { path: "/assignments", element: <P9 /> },
  { path: "/my-asset", element: <P10 /> },
  { path: "/tickets", element: <P11 /> },
  { path: "/tickets/new", element: <P12 /> },
  { path: "/tickets/:id", element: <P13 /> },
  { path: "/users", element: <P14 /> },
  { path: "/users/:id", element: <P15 /> },
  { path: "/reports", element: <P16 /> },
  { path: "/audit-logs", element: <P17 /> },
  { path: "/settings", element: <P18 /> },
  { path: "/qr/:assetTag", element: <P19 /> },
  { path: "/profile", element: <P20 /> },
  { path: "*", element: <P21 /> },
];