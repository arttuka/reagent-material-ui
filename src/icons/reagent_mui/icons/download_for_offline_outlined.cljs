(ns reagent-mui.icons.download-for-offline-outlined
  "Imports @mui/icons-material/DownloadForOfflineOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def download-for-offline-outlined (create-svg-icon (e "path" #js {"d" "M12 2C6.49 2 2 6.49 2 12s4.49 10 10 10 10-4.49 10-10S17.51 2 12 2zm0 18c-4.41 0-8-3.59-8-8s3.59-8 8-8 8 3.59 8 8-3.59 8-8 8zm2.59-11.41L16 10l-4 4-4-4 1.41-1.41L11 10.17V6h2v4.17l1.59-1.58zM17 17H7v-2h10v2z"})
                                                    "DownloadForOfflineOutlined"))
