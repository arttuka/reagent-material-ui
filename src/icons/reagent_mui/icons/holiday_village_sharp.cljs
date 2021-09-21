(ns reagent-mui.icons.holiday-village-sharp
  "Imports @mui/icons-material/HolidayVillageSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def holiday-village-sharp (create-svg-icon (e "path" #js {"d" "M18 20V8.35L13.65 4h-2.83L16 9.18V20h2zm4 0V6.69L19.31 4h-2.83L20 7.52V20h2zM8 4l-6 6v10h5v-5h2v5h5V10L8 4zm1 9H7v-2h2v2z"})
                                            "HolidayVillageSharp"))
