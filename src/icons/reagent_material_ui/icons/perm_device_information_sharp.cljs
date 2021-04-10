(ns reagent-material-ui.icons.perm-device-information-sharp
  "Imports @material-ui/icons/PermDeviceInformationSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def perm-device-information-sharp (create-svg-icon (e "path" #js {"d" "M13 7h-2v2h2V7zm0 4h-2v6h2v-6zM5 1v22h14V1H5zm12 18H7V5h10v14z"})
                                                    "PermDeviceInformationSharp"))
