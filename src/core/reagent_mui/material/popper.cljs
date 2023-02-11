(ns reagent-mui.material.popper
  "Imports @mui/material/Popper as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/popper/ ."
  (:require [reagent.core :as r]
            ["@mui/material/Popper" :as MuiPopper]))

(def popper (r/adapt-react-class (.-default MuiPopper)))
