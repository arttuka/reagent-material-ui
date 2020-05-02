(ns reagent-material-ui.core.root-ref
  "Imports @material-ui/core/RootRef as a Reagent component.
   Original documentation is at https://material-ui.com/api/root-ref/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/RootRef" :as MuiRootRef]))

(def root-ref (adapt-react-class (or (.-default MuiRootRef) (.-RootRef MuiRootRef)) "mui-root-ref"))
