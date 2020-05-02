(ns reagent-material-ui.core.popper
  "Imports @material-ui/core/Popper as a Reagent component.
   Original documentation is at https://material-ui.com/api/popper/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/Popper" :as MuiPopper]))

(def popper (adapt-react-class (or (.-default MuiPopper) (.-Popper MuiPopper)) "mui-popper"))
