(ns reagent-material-ui.core.popper
  "Imports @material-ui/core/Popper as a Reagent component.
   Original documentation is at https://material-ui.com/api/popper/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/Popper" :as Popper]))

(def popper (adapt-react-class (or (.-default Popper) (.-Popper Popper)) "mui-popper"))
