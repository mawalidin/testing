package awal.tugas.balsem;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

//tanggal pengerjaan: 5//7/2020
//nim: 10117094
//nama: Muhammad Walidin
//kelas: IF-3
public class OnboardingAdapter extends RecyclerView.Adapter<OnboardingAdapter.OnboardingViewHolder>{

    private List<OnboardingItem> onboardingItems;

    public OnboardingAdapter(List<OnboardingItem> onboardingItems) {
        this.onboardingItems = onboardingItems;
    }

    @NonNull
    @Override
    public OnboardingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new OnboardingViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(
                        R.layout.item_container_onboarding, parent, false
                )
        );
    }

    //tanggal pengerjaan: 5//7/2020
    //nim: 10117094
    //nama: Muhammad Walidin
    //kelas: IF-3
    @Override
    public void onBindViewHolder(@NonNull OnboardingViewHolder holder, int position) {
        holder.setOnboardingData(onboardingItems.get(position));
    }

    @Override
    public int getItemCount() {
        return onboardingItems.size();
    }

    class OnboardingViewHolder extends RecyclerView.ViewHolder {
        private TextView textTitle;
        private TextView textDescription;
        private ImageView imageOnboarding;

        public OnboardingViewHolder(@NonNull View itemView) {
            super(itemView);
            textTitle = itemView.findViewById(R.id.textTitle);
            textDescription = itemView.findViewById(R.id.textDescription);
            imageOnboarding = itemView.findViewById(R.id.imageOnboarding);
        }
        void setOnboardingData(OnboardingItem onboardingItem){
            textTitle.setText(onboardingItem.getTitle());
            textDescription.setText(onboardingItem.getDescription());
            imageOnboarding.setImageResource(onboardingItem.getImage());
        }

    }
}
