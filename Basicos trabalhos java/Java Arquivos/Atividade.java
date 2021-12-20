class Atividade extends Thread
{
		private int atual;
		private int maximo;
		
		public Atividade(int t)
		{
			atual = 0;
			maximo = t;
		}	
			public int getMaximo()
			{
				return maximo;
			}
			public int getAtual()
			{
				return atual;
			}
			public void run()
			{
				while(atual < maximo && !interrupted())
				{
					try
					{
						sleep(5);
					}
					catch(InterruptedException e)
					{
						return;
					}
					atual++;
				}
			}
		}