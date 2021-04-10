(ns reagent-material-ui.icons.perm-device-information-two-tone
  "Imports @material-ui/icons/PermDeviceInformationTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def perm-device-information-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M7 20h10v1H7zM7 3h10v1H7z", "opacity" ".3"}) (e "path" #js {"d" "M11 7h2v2h-2zm0 4h2v6h-2zm6-9.99L7 1c-1.1 0-2 .9-2 2v18c0 1.1.9 2 2 2h10c1.1 0 2-.9 2-2V3c0-1.1-.9-1.99-2-1.99zM17 21H7v-1h10v1zm0-3H7V6h10v12zm0-14H7V3h10v1z"}))
                                                       "PermDeviceInformationTwoTone"))
