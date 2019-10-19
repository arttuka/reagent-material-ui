(ns reagent-material-ui.core.modal-manager
  "Imports @material-ui/core/ModalManager as a Reagent component.
   Original documentation is at https://material-ui.com/api/modal-manager/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def modal-manager (r/adapt-react-class (.-ModalManager js/MaterialUI)))
