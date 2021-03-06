(ns reagent-material-ui.icons.double-arrow-rounded
  "Imports @material-ui/icons/DoubleArrowRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def double-arrow-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M13.99 5h-.04c-.81 0-1.29.92-.81 1.58L17 12l-3.87 5.42c-.47.66 0 1.58.81 1.58h.04c.32 0 .63-.16.81-.42l4.29-6c.25-.35.25-.81 0-1.16l-4.29-6a.977.977 0 0 0-.8-.42z"}) (e "path" #js {"d" "M7.99 5h-.05c-.81 0-1.28.92-.81 1.58L11 12l-3.87 5.42c-.47.66 0 1.58.81 1.58h.04c.32 0 .63-.16.81-.42l4.29-6c.25-.35.25-.81 0-1.16l-4.29-6a.977.977 0 0 0-.8-.42z"}))
                                           "DoubleArrowRounded"))
