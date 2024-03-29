(ns reagent-mui.icons.phone-android-two-tone
  "Imports @mui/icons-material/PhoneAndroidTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def phone-android-two-tone (create-svg-icon [(e "path" #js {"d" "M7 4h10v14H7z", "opacity" ".3"}) (e "path" #js {"d" "M16 1H8C6.34 1 5 2.34 5 4v16c0 1.66 1.34 3 3 3h8c1.66 0 3-1.34 3-3V4c0-1.66-1.34-3-3-3zm-2 20h-4v-1h4v1zm3-3H7V4h10v14z"})]
                                             "PhoneAndroidTwoTone"))
