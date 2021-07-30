(ns reagent-material-ui.icons.offline-share-outlined
  "Imports @material-ui/icons/OfflineShareOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def offline-share-outlined (create-svg-icon [(e "path" #js {"d" "M6 5H4v16c0 1.1.9 2 2 2h10v-2H6V5z"}) (e "path" #js {"d" "M18 1h-8c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h8c1.1 0 2-.9 2-2V3c0-1.1-.9-2-2-2zm0 16h-8v-1h8v1zm0-3h-8V6h8v8zm0-10h-8V3h8v1z"}) (e "path" #js {"d" "M12.5 10.25h1.63l-.69.69L14.5 12 17 9.5 14.5 7l-1.06 1.06.69.69H12c-.55 0-1 .45-1 1V12h1.5v-1.75z"})]
                                             "OfflineShareOutlined"))
