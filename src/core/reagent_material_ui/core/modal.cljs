(ns reagent-material-ui.core.modal
  "Imports @material-ui/core/Modal as a Reagent component.
   Original documentation is at https://material-ui.com/api/modal/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/Modal" :as MuiModal]))

(def modal (adapt-react-class (or (.-default MuiModal) (.-Modal MuiModal)) "mui-modal"))
