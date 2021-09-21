(ns reagent-mui.icons.details-two-tone
  "Imports @mui/icons-material/DetailsTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def details-two-tone (create-svg-icon [(e "path" #js {"d" "M13 8.92 18.6 19H13V8.92zm-2 0V19H5.4L11 8.92z", "opacity" ".3"}) (e "path" #js {"d" "M12 3 2 21h20L12 3zm1 5.92L18.6 19H13V8.92zm-2 0V19H5.4L11 8.92z"})]
                                       "DetailsTwoTone"))
