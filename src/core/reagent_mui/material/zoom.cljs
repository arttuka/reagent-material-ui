(ns reagent-mui.material.zoom
  "Imports @mui/material/Zoom as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/zoom/ ."
  (:require [reagent.core :as r]
            ["@mui/material/Zoom" :as MuiZoom]))

(def zoom (r/adapt-react-class (.-default MuiZoom)))
