(ns reagent-mui.icons.email-sharp
  "Imports @mui/icons-material/EmailSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def email-sharp (create-svg-icon (e "path" #js {"d" "M22 4H2v16h20V4zm-2 4-8 5-8-5V6l8 5 8-5v2z"})
                                  "EmailSharp"))
