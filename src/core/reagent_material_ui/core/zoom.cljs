(ns reagent-material-ui.core.zoom
  "Imports @material-ui/core/Zoom as a Reagent component.
   Original documentation is at https://material-ui.com/api/zoom/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/Zoom" :as MuiZoom]))

(def zoom (adapt-react-class (or (.-default MuiZoom) (.-Zoom MuiZoom)) "mui-zoom"))
