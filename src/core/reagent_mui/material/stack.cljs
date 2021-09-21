(ns reagent-mui.material.stack
  "Imports @mui/material/Stack as a Reagent component.
   Original documentation is at https://mui.com/api/stack/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/Stack" :as MuiStack]))

(def stack (adapt-react-class (.-default MuiStack) "mui-stack"))
