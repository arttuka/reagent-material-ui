(ns reagent-mui.icons.bedtime-rounded
  "Imports @mui/icons-material/BedtimeRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def bedtime-rounded (create-svg-icon (e "path" #js {"d" "M11.97 2.73c.16-.34-.12-.72-.5-.7-6 .3-10.47 5.83-9.28 11.96.78 4.03 4.09 7.22 8.14 7.87 4.07.66 7.77-1.14 9.87-4.15.21-.31.04-.75-.33-.79-6.74-.76-10.87-7.96-7.9-14.19z"})
                                      "BedtimeRounded"))
