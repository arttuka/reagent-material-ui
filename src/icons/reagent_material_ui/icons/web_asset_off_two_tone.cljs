(ns reagent-material-ui.icons.web-asset-off-two-tone
  "Imports @material-ui/icons/WebAssetOffTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def web-asset-off-two-tone (create-svg-icon [(e "path" #js {"d" "M20 17.17V8h-9.17L20 17.17zM5.17 8H4v10h11.17l-10-10z", "opacity" ".3"}) (e "path" #js {"d" "M6.83 4H20c1.11 0 2 .9 2 2v12c0 .34-.09.66-.23.94L20 17.17V8h-9.17l-4-4zm13.66 19.31L17.17 20H4c-1.11 0-2-.9-2-2V6c0-.34.08-.66.23-.94L.69 3.51 2.1 2.1l19.8 19.8-1.41 1.41zM15.17 18l-10-10H4v10h11.17z"})]
                                             "WebAssetOffTwoTone"))
