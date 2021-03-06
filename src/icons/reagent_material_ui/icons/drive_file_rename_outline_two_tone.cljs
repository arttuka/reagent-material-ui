(ns reagent-material-ui.icons.drive-file-rename-outline-two-tone
  "Imports @material-ui/icons/DriveFileRenameOutlineTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def drive-file-rename-outline-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M12.06 10.02L5 17.08V18h.92l7.06-7.06z", "opacity" ".3"}) (e "path" #js {"d" "M15 16l-4 4h10v-4zm-2.94-8.81L3 16.25V20h3.75l9.06-9.06-3.75-3.75zM5.92 18H5v-.92l7.06-7.06.92.92L5.92 18zm12.79-9.96c.39-.39.39-1.02 0-1.41l-2.34-2.34c-.2-.2-.45-.29-.71-.29-.25 0-.51.1-.7.29l-1.83 1.83 3.75 3.75 1.83-1.83z"}))
                                                         "DriveFileRenameOutlineTwoTone"))
