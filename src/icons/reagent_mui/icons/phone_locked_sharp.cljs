(ns reagent-mui.icons.phone-locked-sharp
  "Imports @mui/icons-material/PhoneLockedSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def phone-locked-sharp (create-svg-icon [(e "path" #js {"d" "M20 5V4c0-1.1-.9-2-2-2s-2 .9-2 2v1h-1v5h6V5h-1zm-1 0h-2V4c0-.55.45-1 1-1s1 .45 1 1v1z"}) (e "path" #js {"d" "m21 15-5-1-2.9 2.9c-2.5-1.43-4.57-3.5-6-6L10 8 9 3H3c0 3.28.89 6.35 2.43 9 1.58 2.73 3.85 4.99 6.57 6.57C14.65 20.1 17.72 21 21 21v-6z"})]
                                         "PhoneLockedSharp"))
