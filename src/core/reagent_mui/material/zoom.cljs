(ns reagent-mui.material.zoom
  "Imports @mui/material/Zoom as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/zoom/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/Zoom" :as MuiZoom]))

(def zoom (adapt-react-class (.-default MuiZoom) "mui-zoom"))
