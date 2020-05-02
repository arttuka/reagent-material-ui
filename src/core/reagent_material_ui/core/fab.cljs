(ns reagent-material-ui.core.fab
  "Imports @material-ui/core/Fab as a Reagent component.
   Original documentation is at https://material-ui.com/api/fab/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/Fab" :as MuiFab]))

(def fab (adapt-react-class (or (.-default MuiFab) (.-Fab MuiFab)) "mui-fab"))
