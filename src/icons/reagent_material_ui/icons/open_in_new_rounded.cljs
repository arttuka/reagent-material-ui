(ns reagent-material-ui.icons.open-in-new-rounded
  "Imports @material-ui/icons/OpenInNewRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def open-in-new-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M20 12c-.55 0-1 .45-1 1v6H5V5h6c.55 0 1-.45 1-1s-.45-1-1-1H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2v-6c0-.55-.45-1-1-1z"}) (e "path" #js {"d" "M20.5 3h-5.29c-.45 0-.67.54-.35.85l1.94 1.94-7.8 7.8c-.39.39-.39 1.02 0 1.41.39.39 1.02.39 1.41 0l7.79-7.79 1.94 1.94c.32.31.86.09.86-.36V3.5c0-.28-.22-.5-.5-.5z"}))
                                          "OpenInNewRounded"))
