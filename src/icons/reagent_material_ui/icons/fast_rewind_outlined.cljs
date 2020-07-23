(ns reagent-material-ui.icons.fast-rewind-outlined
  "Imports @material-ui/icons/FastRewindOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def fast-rewind-outlined (create-svg-icon (e "path" #js {"d" "M18 9.86v4.28L14.97 12 18 9.86m-9 0v4.28L5.97 12 9 9.86M20 6l-8.5 6 8.5 6V6zm-9 0l-8.5 6 8.5 6V6z"})
                                           "FastRewindOutlined"))
