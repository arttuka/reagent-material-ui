(ns reagent-material-ui.icons.headset-off-outlined
  "Imports @material-ui/icons/HeadsetOffOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def headset-off-outlined (create-svg-icon (e "path" #js {"d" "M12 4c3.87 0 7 3.13 7 7v1h-4v.17L16.83 14H19v2.17l2 2V11c0-4.97-4.03-9-9-9-2.02 0-3.88.67-5.38 1.8l1.43 1.43C9.17 4.45 10.53 4 12 4zM2.1 2.1L.69 3.51l3.33 3.33C3.37 8.09 3 9.5 3 11v7c0 1.1.9 2 2 2h4v-8H5v-1c0-.94.19-1.83.52-2.65L15 17.83V20h2.17l1 1H12v2h7c.34 0 .65-.09.93-.24l.55.55 1.41-1.41L2.1 2.1zM7 14v4H5v-4h2z"})
                                           "HeadsetOffOutlined"))
