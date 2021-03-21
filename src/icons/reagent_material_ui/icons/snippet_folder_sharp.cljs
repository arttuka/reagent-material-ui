(ns reagent-material-ui.icons.snippet-folder-sharp
  "Imports @material-ui/icons/SnippetFolderSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def snippet-folder-sharp (create-svg-icon (e "path" #js {"d" "M12 6l-2-2H2v16h20V6H12zm7 11h-6V9h3.5l2.5 2.5V17zm-3.12-6.5l1.62 1.62v3.38h-3v-5h1.38z"})
                                           "SnippetFolderSharp"))
