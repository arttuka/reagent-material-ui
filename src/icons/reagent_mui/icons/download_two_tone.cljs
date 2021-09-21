(ns reagent-mui.icons.download-two-tone
  "Imports @mui/icons-material/DownloadTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def download-two-tone (create-svg-icon [(e "path" #js {"d" "M13 9V5h-2v6H9.83L12 13.17 14.17 11H13z", "opacity" ".3"}) (e "path" #js {"d" "M15 9V3H9v6H5l7 7 7-7h-4zm-3 4.17L9.83 11H11V5h2v6h1.17L12 13.17zM5 18h14v2H5z"})]
                                        "DownloadTwoTone"))
