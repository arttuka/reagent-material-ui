(ns reagent-mui.material.portal
  "Imports @mui/material/Portal as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/portal/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/Portal" :as MuiPortal]))

(def portal (adapt-react-class (.-default MuiPortal) "mui-portal"))
