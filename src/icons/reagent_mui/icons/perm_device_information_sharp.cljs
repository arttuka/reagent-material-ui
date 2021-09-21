(ns reagent-mui.icons.perm-device-information-sharp
  "Imports @mui/icons-material/PermDeviceInformationSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def perm-device-information-sharp (create-svg-icon (e "path" #js {"d" "M13 7h-2v2h2V7zm0 4h-2v6h2v-6zM5 1v22h14V1H5zm12 18H7V5h10v14z"})
                                                    "PermDeviceInformationSharp"))
