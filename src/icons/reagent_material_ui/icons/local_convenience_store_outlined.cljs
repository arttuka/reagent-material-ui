(ns reagent-material-ui.icons.local-convenience-store-outlined
  "Imports @material-ui/icons/LocalConvenienceStoreOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def local-convenience-store-outlined (create-svg-icon (e "path" #js {"d" "M19 7V4H5v3H2v13h8v-4h4v4h8V7h-3zm1 11h-4v-4H8v4H4V9h3V6h10v3h3v9zM8 8h2v1H8v3h3v-1H9v-1h2V7H8zm7 1h-1V7h-1v3h2v2h1V7h-1z"})
                                                       "LocalConvenienceStoreOutlined"))
