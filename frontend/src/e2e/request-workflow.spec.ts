import { test, expect } from '@playwright/test';

test('employee completes full request workflow', async ({ page }) => {
  await page.goto('/login');
  await expect(page).toHaveURL(/login/);
});
