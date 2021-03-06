(ns reagent-material-ui.icons.system-update-alt-rounded
  "Imports @material-ui/icons/SystemUpdateAltRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def system-update-alt-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M8.85 11.85l2.79 2.79c.2.2.51.2.71 0l2.79-2.79c.32-.31.09-.85-.35-.85H13V5c0-.55-.45-1-1-1s-1 .45-1 1v6H9.21c-.45 0-.67.54-.36.85z"}) (e "path" #js {"d" "M20 4h-4c-.55 0-1 .45-1 1s.45 1 1 1h4v12H4V6h4c.55 0 1-.45 1-1s-.45-1-1-1H4c-1.1 0-2 .89-2 2v12c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V6c0-1.1-.9-2-2-2z"}))
                                                "SystemUpdateAltRounded"))
