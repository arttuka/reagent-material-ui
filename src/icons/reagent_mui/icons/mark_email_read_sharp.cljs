(ns reagent-mui.icons.mark-email-read-sharp
  "Imports @mui/icons-material/MarkEmailReadSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def mark-email-read-sharp (create-svg-icon (e "path" #js {"d" "M12 19c0-3.87 3.13-7 7-7 1.08 0 2.09.25 3 .68V4H2v16h10.08c-.05-.33-.08-.66-.08-1zM4 6l8 5 8-5v2l-8 5-8-5V6zm13.34 16-3.54-3.54 1.41-1.41 2.12 2.12 4.24-4.24L23 16.34 17.34 22z"})
                                            "MarkEmailReadSharp"))
