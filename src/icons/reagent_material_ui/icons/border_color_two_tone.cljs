(ns reagent-material-ui.icons.border-color-two-tone
  "Imports @material-ui/icons/BorderColorTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def border-color-two-tone (create-svg-icon (e "path" #js {"d" "M16.81 8.94l-3.75-3.75L4 14.25V18h3.75l9.06-9.06zM6 16v-.92l7.06-7.06.92.92L6.92 16H6zm13.71-9.96c.39-.39.39-1.02 0-1.41l-2.34-2.34c-.2-.2-.45-.29-.71-.29-.25 0-.51.1-.7.29l-1.83 1.83 3.75 3.75 1.83-1.83zM2 20h20v4H2z"})
                                            "BorderColorTwoTone"))
