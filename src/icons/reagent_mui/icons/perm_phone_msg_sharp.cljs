(ns reagent-mui.icons.perm-phone-msg-sharp
  "Imports @mui/icons-material/PermPhoneMsgSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def perm-phone-msg-sharp (create-svg-icon (e "path" #js {"d" "M12 3v10l3-3h6V3zm1.21 14.37c-2.83-1.44-5.15-3.75-6.59-6.59l2.53-2.53L8.54 3H3.03C2.45 13.18 10.82 21.55 21 20.97v-5.51l-5.27-.61-2.52 2.52z"})
                                           "PermPhoneMsgSharp"))
