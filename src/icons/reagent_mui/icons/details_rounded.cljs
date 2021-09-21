(ns reagent-mui.icons.details-rounded
  "Imports @mui/icons-material/DetailsRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def details-rounded (create-svg-icon (e "path" #js {"d" "m11.13 4.57-8.3 14.94c-.37.67.11 1.49.87 1.49h16.6c.76 0 1.24-.82.87-1.49l-8.3-14.94c-.38-.68-1.36-.68-1.74 0zM13 8.92 18.6 19H13V8.92zm-2 0V19H5.4L11 8.92z"})
                                      "DetailsRounded"))
