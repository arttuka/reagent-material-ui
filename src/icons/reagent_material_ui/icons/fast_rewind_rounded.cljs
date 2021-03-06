(ns reagent-material-ui.icons.fast-rewind-rounded
  "Imports @material-ui/icons/FastRewindRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def fast-rewind-rounded (create-svg-icon (e "path" #js {"d" "M19.45 7.04l-6.2 4.13c-.59.4-.59 1.27 0 1.66l6.2 4.13c.66.44 1.55-.03 1.55-.83V7.87c0-.8-.89-1.28-1.55-.83zM11 16.13V7.87c0-.8-.89-1.28-1.55-.83l-6.2 4.13c-.59.4-.59 1.27 0 1.66l6.2 4.13c.66.45 1.55-.03 1.55-.83z"})
                                          "FastRewindRounded"))
