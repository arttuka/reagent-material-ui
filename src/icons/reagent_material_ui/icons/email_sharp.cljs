(ns reagent-material-ui.icons.email-sharp
  "Imports @material-ui/icons/EmailSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def email-sharp (create-svg-icon (e "path" #js {"d" "M22 4H2v16h20V4zm-2 4l-8 5-8-5V6l8 5 8-5v2z"})
                                  "EmailSharp"))
