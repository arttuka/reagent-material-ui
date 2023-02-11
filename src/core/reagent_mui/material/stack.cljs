(ns reagent-mui.material.stack
  "Imports @mui/material/Stack as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/stack/ ."
  (:require [reagent.core :as r]
            ["@mui/material/Stack" :as MuiStack]))

(def stack (r/adapt-react-class (.-default MuiStack)))
