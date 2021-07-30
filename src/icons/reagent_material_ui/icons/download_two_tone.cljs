(ns reagent-material-ui.icons.download-two-tone
  "Imports @material-ui/icons/DownloadTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def download-two-tone (create-svg-icon [(e "path" #js {"d" "M13 9V5h-2v6H9.83L12 13.17 14.17 11H13z", "opacity" ".3"}) (e "path" #js {"d" "M15 9V3H9v6H5l7 7 7-7h-4zm-3 4.17L9.83 11H11V5h2v6h1.17L12 13.17zM5 18h14v2H5z"})]
                                        "DownloadTwoTone"))
