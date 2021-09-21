(ns reagent-mui.material.popper
  "Imports @mui/material/Popper as a Reagent component.
   Original documentation is at https://mui.com/api/popper/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/Popper" :as MuiPopper]))

(def popper (adapt-react-class (.-default MuiPopper) "mui-popper"))
