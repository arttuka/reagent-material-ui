(ns reagent-material-ui.icons.font-download-rounded
  "Imports @material-ui/icons/FontDownloadRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def font-download-rounded (create-svg-icon (e "path" #js {"d" "M9.93 13.5h4.14L12 7.98 9.93 13.5zM20 2H4c-1.1 0-2 .9-2 2v16c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V4c0-1.1-.9-2-2-2zm-4.29 15.88-.9-2.38H9.17l-.89 2.37c-.14.38-.5.63-.91.63-.68 0-1.15-.69-.9-1.32l4.25-10.81c.22-.53.72-.87 1.28-.87s1.06.34 1.27.87l4.25 10.81c.25.63-.22 1.32-.9 1.32-.4 0-.76-.25-.91-.62z"})
                                            "FontDownloadRounded"))
