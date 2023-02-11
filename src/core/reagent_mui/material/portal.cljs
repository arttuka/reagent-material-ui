(ns reagent-mui.material.portal
  "Imports @mui/material/Portal as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/portal/ ."
  (:require [reagent.core :as r]
            ["@mui/material/Portal" :as MuiPortal]))

(def portal (r/adapt-react-class (.-default MuiPortal)))
